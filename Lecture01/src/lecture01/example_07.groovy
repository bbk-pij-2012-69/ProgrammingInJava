package lecture01

// Example 7 - Naive sorting - sort three numbers
print "Please enter 1st number for sorting: "
int i1 = Integer.parseInt(System.console().readLine())
print "Please enter 2nd number for sorting: "
int i2 = Integer.parseInt(System.console().readLine())
print "Please enter 3rd number for sorting: "
int i3 = Integer.parseInt(System.console().readLine())
def numbers = [i1,i2,i3]
numbers.sort()
for(int i = 0; i < numbers.size(); ++i)
    println numbers[i];
