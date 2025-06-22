// Validate the form before submitting it.
function validateForm() {
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var email = document.getElementById("email").value;
  
    if (fname == "" || lname == "" || email == "") {
      alert("Please fill out all required fields.");
      return false;
    } else if (!/^[a-zA-Z]+$/.test(fname) || !/^[a-zA-Z]+$/.test(lname)) {
      alert("Please enter a valid name.");
      return false;
    } else if (!/^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)$/.test(email)) {
      alert("Please enter a valid email address.");
      return false;
    } else {
      return true;
    }
  }
  
  // Submit the form when the button is clicked.
  document.getElementById("submit").addEventListener("click", function(event) {
    event.preventDefault();
  
    if (validateForm()) {
      this.form.submit();
    }
  });

  function clearResponse() {
    document.getElementById("registration").reset();
}
