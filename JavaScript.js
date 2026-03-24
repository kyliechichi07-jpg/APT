const prompt = require('prompt-sync')();

const name = prompt("Enter Student's Name: ");
const units = parseInt(prompt("Enter Number of Units Registered: "));

let status;
if (units > 7) {
    status = "overload - Approval Required";
} else {
    status = "Registration Accepted";
}

console.log(`Student Name: ${name}`);
console.log(`Units Registered: ${units}`);
console.log(`Registration Status: ${status}`);