const token = localStorage.getItem("token");

if (!token) {
    alert("Please login first!");
    window.location.href = "login.html";
}

async function loadArticles() {

    const container = document.getElementById("lessonsContainer");
    container.innerHTML = '<div style="text-align:center;padding:40px;color:#64748b"><i class="fa-solid fa-spinner fa-spin"></i> Loading articles...</div>';

    try {
        const response = await fetch("/articles", {
            headers: {
                "Authorization": "Bearer " + token
            }
        });

        if (!response.ok) {
            throw new Error("Failed to load articles (HTTP " + response.status + ")");
        }

        const articles = await response.json();

        container.innerHTML = "";

        if (articles.length === 0) {
            container.innerHTML = '<div style="text-align:center;padding:40px;color:#64748b"><p>No articles available yet. Check back later.</p></div>';
            return;
        }

        articles.forEach(article => {

            container.innerHTML += `

            <div class="card">

                <i class="fa-solid fa-scale-balanced"></i>

                <h3>${article.articleNumber}</h3>

                <p><b>${article.title}</b></p>

                <p>${article.content.substring(0,120)}...</p>

                <a href="article.html?id=${article.id}" class="btn">Read More</a>

            </div>

            `;

        });

    } catch (e) {
        container.innerHTML = '<div style="text-align:center;padding:40px;color:#dc2626"><p>Error: ' + e.message + '</p><p style="font-size:14px;margin-top:10px"><a href="login.html" style="color:#2563eb;">Go to Login</a></p></div>';
    }
}

loadArticles();
