package lecture01

// Example 6 - Division - without the divisor
print "Please enter 1st number for division: "
int i1 = Integer.parseInt(System.console().readLine())
print "Please enter 2nd number as divisor: "
int i2 = Integer.parseInt(System.console().readLine())
int count = 0, val = i1
while (val > 0 && val >= i2)
{
    val -= i2
    count++
}
println i1 + " divided by " + i2 + " is " + count + ", remainder " + val
