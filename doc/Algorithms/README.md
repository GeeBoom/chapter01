##

- 以下这段代码会打印什么？

````
String string1 = "hello";
String string2 = string1;
string1 = "world";
StdOut.println(string1);
StdOut.println(string2);
````

- 以下递归函数的返回值是什么？

````
public static String mystery(String s) {
    int N = s.length();
    if (N <= 1) return s;
    String a = s.substring(0, N/2);
    String b = s.substring(N/2, N);
    return mystery(b) + mystery(a);
}
````

- 假设某个用例程序会进行一系列入栈和出栈的混合栈操作。入栈操作会将整数0到9按顺序
压入栈；出栈操作会打印出返回值。下面哪种序列是不可能产生的？
````

 (a)  4 3 2 1 0 9 8 7 6 5
 
 (b)  4 6 8 7 5 3 2 9 0 1
 
 (c)  2 5 6 7 4 8 9 3 1 0
 
 (d)  4 3 2 1 0 5 6 7 8 9
 
 (e)  1 2 3 4 5 6 9 8 7 0
 
 (f)  0 4 6 5 3 8 1 7 2 9
 
 (g)  1 4 7 9 8 6 5 3 0 2
 
 (h)  2 1 4 3 6 5 8 7 9 0
 ````
 
 - 编写一个Stack的用例Parentheses,从标准输入中读取一个文本流并使用栈判定其中的括号
 是否配对完整。例如，对于[()]{}{[()()]()}程序应该打印true，对于[(])则打印false