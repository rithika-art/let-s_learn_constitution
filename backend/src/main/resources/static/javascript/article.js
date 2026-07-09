const token = localStorage.getItem("token");

const params = new URLSearchParams(window.location.search);

const id = params.get("id");

async function loadArticle(){

    const response = await fetch("/articles/" + id,{

        headers:{
            "Authorization":"Bearer " + token
        }

    });

    const article = await response.json();

    document.getElementById("articleNumber").innerText =
        article.articleNumber;

    document.getElementById("title").innerText =
        article.title;

    document.getElementById("part").innerText =
        article.part;

    document.getElementById("chapter").innerText =
        article.chapter;

    document.getElementById("content").innerText =
        article.content;

    document.getElementById("keywords").innerText =
        article.keywords;

}

loadArticle();

