#include <stdio.h>
int main()
{
    char name[50];
    int units;
    char status[50];

    printf("Enter Student's Name: ");
    scanf("%s", name);
    printf("Enter Number of Units Registered: ");
    scanf("%d", &units);

    if (units > 7)
    {
        sprintf(status, "overload - Approval Required");
    }
    else
    {
        sprintf(status, "Registration Accepted");
    }

    printf("Student Name: %s\n", name);
    printf("Units Registered: %d\n", units);
    printf("Registration Status: %s\n", status);

    return 0;
}