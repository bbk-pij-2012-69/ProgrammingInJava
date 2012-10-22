package lecture02
java.util.Scanner sc = new java.util.Scanner(System.in);
print "Please enter you string: "
def line = sc.nextLine() as String

for(def i = 0; i < line.size(); ++i)
{
    println line[i]
}

def i = 0
while(i < line.size())
{
    println line[i]
    ++i
}
