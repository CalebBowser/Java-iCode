document.addEventListener('DOMContentLoaded', function () {
    document.querySelectorAll('nav ul li a').forEach(function (element) {
        element.addEventListener('mouseover', function () {
            this.style.color = 'yellow';
        });
        element.addEventListener('mouseout', function () {
            this.style.color = 'white';
        });
    });
});
