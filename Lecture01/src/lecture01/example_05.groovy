package lecture01

// Example 5 - Multiplication without the multiplier
print "Please enter 1st number for multiplication: "
int i1 = Integer.parseInt(System.console().readLine())
print "Please enter 2nd number for multiplication: "
int i2 = Integer.parseInt(System.console().readLine())
int count = 0, total = 0
while (count < i2)
{
    total += i1
    count++
}
print total
