const BASE_URL = "http://localhost:8081";
const token = localStorage.getItem("token");

async function loadArticles() {

    const response = await fetch(BASE_URL + "/articles", {

        headers: {
            "Authorization": "Bearer " + token
        }

    });

    const articles = await response.json();

    const container = document.getElementById("lessonsContainer");

    container.innerHTML = "";

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

}

loadArticles();