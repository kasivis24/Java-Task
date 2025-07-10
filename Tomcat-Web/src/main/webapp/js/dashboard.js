document.addEventListener('DOMContentLoaded', function () {
    const userIcon = document.getElementById('userIcon');
    const dialog = document.getElementById('userDialog');
    const closeBtn = document.querySelector('.close');
    const nameElem = document.getElementById('userName');
    const emailElem = document.getElementById('userEmail');

    if (userIcon) {
        userIcon.addEventListener('click', function (e) {
            e.preventDefault();
            console.log("User icon clicked");

            fetch("/movieticketbooking/userprofile")
                .then(res => res.json())
                .then(data => {
                    nameElem.textContent = data.name;
                    emailElem.textContent = data.gmail;
                    dialog.style.display = 'block';
                })
                .catch(err => {
                    console.error("Failed to load user profile:", err);
                });
        });
    }

    closeBtn.addEventListener('click', () => {
        dialog.style.display = 'none';
    });

    window.addEventListener('click', (event) => {
        if (event.target === dialog) {
            dialog.style.display = 'none';
        }
    });
});

document.addEventListener('DOMContentLoaded', function () {
    const bookButtons = document.querySelectorAll(".bookTicket");
    bookButtons.forEach(button => {
        button.addEventListener("click", function (e) {
            e.preventDefault();
            console.log("onclick ticket for:", this);
            window.location.href = `/movieticketbooking/booking?showId=${encodeURIComponent()}`;
        });
    });
});

