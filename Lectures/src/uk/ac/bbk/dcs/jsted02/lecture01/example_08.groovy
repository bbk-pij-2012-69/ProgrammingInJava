package lecture01

// Example 8 - Maximising - print highest number
int highest = 0
while(true)
{
    int i1 = Integer.parseInt(System.console().readLine())
    if (i1 > highest)
        highest = i1;
    else if (i1 == -1)
        break;
}
println "Highest number: " + highest

