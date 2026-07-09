// Welcome message
console.log("Learning Management System Loaded");

// Login Validation
function validateLogin() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if(username === "" || password === "") {
        alert("Please fill all fields");
        return false;
    }

    alert("Login Successful");
    return true;
}

// Registration Validation
function validateRegister() {
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;

    if(password !== confirmPassword){
        alert("Passwords do not match");
        return false;
    }

    alert("Registration Successful");
    return true;
}

// Quiz Score Function
function checkScore(score,total){
    alert("Your Score: " + score + "/" + total);
}