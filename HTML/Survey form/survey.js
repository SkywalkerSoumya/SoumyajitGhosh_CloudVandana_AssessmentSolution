function submitForm() {
    // Get form values
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const genderElements = document.getElementsByName("gender");
    const selectedGenders = [];
    genderElements.forEach(element => {
        if (element.checked) {
            selectedGenders.push(element.value);
        }
    });
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    // Validate the form (you can add more validations here)

    // Display results in the popup
    const popupContent = document.getElementById("popup-results");
    popupContent.innerHTML = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender(s):</strong> ${selectedGenders.join(", ")}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    // Show the popup
    const popup = document.getElementById("popup");
    popup.style.display = "block";

    return false; // Prevent the form from submitting
}

function resetForm() {
    // Reset form fields
    document.getElementById("surveyForm").reset();
}

function closePopup() {
    // Close the popup and reset the form
    const popup = document.getElementById("popup");
    popup.style.display = "none";
    resetForm();
}
