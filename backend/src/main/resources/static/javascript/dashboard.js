const token = localStorage.getItem("token");

async function loadDashboard() {

    if (!token) {
        alert("Please login first!");
        window.location.href = "login.html";
        return;
    }

    const payload = JSON.parse(atob(token.split(".")[1].replace(/-/g, '+').replace(/_/g, '/')));
    document.getElementById("username").innerText = payload.sub;

    const headers = {
        "Authorization": "Bearer " + token
    };

    try {
        const articleResponse = await fetch("/articles", {
            headers: headers
        });

        if (articleResponse.ok) {
            const articles = await articleResponse.json();
            document.getElementById("totalArticles").innerText =
                articles.length + " Articles";
        }
    } catch (e) {
        console.log("Articles Error:", e);
    }

    try {
        const questionResponse = await fetch("/questions", {
            headers: headers
        });

        if (questionResponse.ok) {
            const questions = await questionResponse.json();
            document.getElementById("totalQuestions").innerText =
                questions.length + " Questions";
        }
    } catch (e) {
        console.log("Questions Error:", e);
    }

    try {
        const leaderboardResponse = await fetch("/leaderboard", {
            headers: headers
        });

        if (leaderboardResponse.ok) {
            const leaderboard = await leaderboardResponse.json();
            document.getElementById("leaderboardCount").innerText =
                leaderboard.length + " Players";
        }
    } catch (e) {
        console.log("Leaderboard Error:", e);
    }

    try {
        const userResponse = await fetch("/users/me", {
            headers: headers
        });

        if (userResponse.ok) {
            const user = await userResponse.json();
            const progressResponse = await fetch("/progress/user/" + user.userId, {
                headers: headers
            });

            if (progressResponse.ok) {
                const progress = await progressResponse.json();
                const pct = progress.completedArticles > 0 || progress.completedQuizzes > 0
                    ? Math.round((progress.completedArticles + progress.completedQuizzes) / 20 * 100)
                    : 0;
                document.getElementById("userProgress").innerText = pct + "% Completed";
            }
        }
    } catch (e) {
        console.log("Progress Error:", e);
    }
}

loadDashboard();
