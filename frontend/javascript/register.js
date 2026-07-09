
const BASE_URL = "http://localhost:8081";

async function registerUser() {
    console.log("register.js loaded");
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    const response = await fetch(BASE_URL + "/auth/register", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify({

            name: name,
            email: email,
            password: password,
            role: "USER"

        })

    });

    if(response.ok){

        alert("Registration Successful!");

        window.location.href="login.html";

    }

    else{

        alert("Registration Failed!");

    }

}