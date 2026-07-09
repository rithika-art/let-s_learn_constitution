async function loginUser() {

    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    const response = await fetch("/auth/login", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify({
            email: email,
            password: password
        })

    });

    if(response.ok){

        const token = await response.text();

        localStorage.setItem("token", token);

        alert("Login Successful!");

        window.location.href="dashboard.html";

    }

    else{

        alert("Invalid Email or Password");

    }

}