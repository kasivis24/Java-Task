document.getElementById("loginform").addEventListener("submit", async function (e) {
  e.preventDefault();

  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value.trim();

  if (email === "" || password === "") {
    alert("All fields are required.");
    return;
  }

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailRegex.test(email)) {
    alert("Please enter a valid email.");
    return;
  }

  if (password.length < 6) {
    alert("Password must be at least 6 characters.");
    return;
  }


  const myData = {
    email: email,
    password: password
  };

  try {
    const jsonString = JSON.stringify(myData);

    const response = await fetch("/movieticketbooking/login", {
      method: "POST",
      headers: {
        'Content-Type': 'application/json'
      },
      body: jsonString
    });

    const result = await response.text();

    if (result.includes("Login successful")) {
      window.location.href = "/movieticketbooking/dashboard";
    } else {
      alert("Signup failed: " + result);
    }

  } catch (error) {
    console.error("Error:", error);
    alert("Something went wrong.");
  }
});
