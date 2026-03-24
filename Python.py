name = input ("Enter Student's Name: ")
units = int(input ("Enter Number of Units Registered: "))
if units > 7:
    status = "overload - Approval Required"
else:
    status = "Registration Accepted"
print (f"Student Name: {name}")
print (f"Units Registered: {units}")
print (f"Registration Status: {status}")