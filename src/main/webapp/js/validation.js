/**
 * 
 */

function nameValidation() {
    var firstName = document.getElementById('firstName').value;
    var lastName = document.getElementById('lastName').value;

    if (firstName == "") {
        document.getElementById('firstname').innerHTML = "Please Enter First Name";
        return false;
    }

    if ((firstName.length <= 2) || (firstName >= 15)) {
        document.getElementById('firstname').innerHTML = "First Name must be between 2 to 15";
        return false;
    }
    if (!isNaN(firstName)) {
        document.getElementById('firstname').innerHTML = "First Name must be Charecter";
        return false;
    }

    if (lastName == "") {
        document.getElementById('lastname').innerHTML = "Please Enter Last Name";
        return false;
    }

    if ((lastName.length <= 2) || (lastName >= 15)) {
        document.getElementById('lastname').innerHTML = "Last Name must be between 2 to 15";
        return false;
    }
    if (!isNaN(lastName)) {
        document.getElementById('lastname').innerHTML = "Last Name must be Charecter";
        return false;
    }

}


function Validation() {
    var address = document.getElementById('address').value;
    var city = document.getElementById('city').value;
    var state = document.getElementById('state').value;
    var country = document.getElementById('country').value;
    var pincode = document.getElementById('pincode').value;
    var phone = document.getElementById('phone').value;

    if (address == "") {
        document.getElementById('Address').innerHTML = "Please Enter Address";
        return false;
    }

    if (city == "") {
        document.getElementById('City').innerHTML = "Please Enter City";
        return false;
    }
    if (state == "") {
        document.getElementById('State').innerHTML = "Please Enter State";
        return false;
    }

    if (country == "") {
        document.getElementById('Country').innerHTML = "Please Enter Country";
        return false;
    }

    if (pincode == "") {
        document.getElementById('Pincode').innerHTML = "Please Enter Pin-Code";
        return false;

    }
    if (isNaN(pincode)) {
        document.getElementById('Pincode').innerHTML = "PinCode must be Digit not Charecter";
        return false;
    }
    if ((pincode.length != 6) || (pincode.length < 6)) {
        document.getElementById('Pincode').innerHTML = "Enter Valid PinCode";
        return false;
    }

    if (phone == "") {
        document.getElementById('Phone').innerHTML = "Please Enter Phone";
        return false;
    }

    if (isNaN(phone)) {
        document.getElementById('Phone').innerHTML = "Phone Number must be Digits not charecter";
        return false;
    }
    if (phone.length != 10) {
        document.getElementById('Phone').innerHTML = "Mobile Number must be 10 Digit only ";
        return false;
    }

    if (email == "") {
        document.getElementById('Email').innerHTML = "Please Enter Email ";
        return false;
    }

    if (password == "") {
        document.getElementById('Password').innerHTML = "Please Enter Password";
        return false;
    }
}

function emailValidation() {
    var email = document.getElementById('email').value;
    var password = document.getElementById('password').value;

    if (email == "") {
        document.getElementById('Email').innerHTML = "Please Enter Email ";
        return false;
    }

    if (password == "") {
        document.getElementById('Password').innerHTML = "Please Enter Password";
        return false;
    }
}
