function toggleForms() {
     const loginForm = document.getElementById("loginForm");
     const signupForm = document.getElementById("signupForm");
     const formTitle = document.getElementById("formTitle");
     const toggleText = document.getElementById("toggleText");

     if (loginForm.classList.contains("hidden")) {
         // Show login
        signupForm.classList.add("hidden");
        loginForm.classList.remove("hidden");
        formTitle.innerText = "Patient Login";
        toggleText.innerHTML = `New Patient?
       <a href="javascript:void(0)" onclick="toggleForms()" class="text-blue-600 hover:underline">Register here</a>`;
     } else {
        // Show signup
        loginForm.classList.add("hidden");
        signupForm.classList.remove("hidden");
        formTitle.innerText = "Patient Sign Up";
        toggleText.innerHTML = `Already have an account?
        <a href="javascript:void(0)" onclick="toggleForms()" class="text-blue-600 hover:underline">Login here</a>`;
     }
}