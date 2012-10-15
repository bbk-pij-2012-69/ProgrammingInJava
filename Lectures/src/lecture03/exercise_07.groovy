package lecture03
java.util.Scanner sc = new java.util.Scanner(System.in);
print "Please enter you string: "
def line = sc.nextLine() as String
palindrom = false

if(line.size() % 2 == 1)
{
    int half = (line.size() / 2) + 1 
    StringBuilder stringBuilder = new StringBuilder(line.substring(0,half))

    String reverse = stringBuilder.reverse().toString()
    String sub = line.substring(half - 1 ,line.size()).toString()
    if (sub.equals(reverse))
    {
        palindrom = true
    }
}
else
{
    int half = line.size() / 2
    StringBuilder stringBuilder = new StringBuilder(line.substring(0,half))
    
    String reverse = stringBuilder.reverse().toString()
    String sub = line.substring(half,line.size()).toString()
    if (sub.equals(reverse))
    {
        palindrom = true
    }
}

if (palindrom)
    println line + " IS a strict palindrome."
else
    println line + " is NOT a strict palindrome."
