package lecture01

// Example 9 - Going up - sequential increasing
boolean increasing = true, first = true
int previous
while(true)
{
    int i1 = Integer.parseInt(System.console().readLine())
    if (i1 == -1)
        break;
    if(!first && (i1 - previous) != 1)
        increasing = false;
    previous = i1;
    first = false
}
print ((increasing) ? "Yes" : "No")
