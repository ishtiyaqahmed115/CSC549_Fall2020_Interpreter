Statements:
remember <type> <var-name> = <expression>;
question <test-expression> do <true-statement> otherwise <false-statement>;
update <var-name> = <expression>;
while <test-expression> do <statement>;
print <expression>;

Expressions:
resolve expressions - int-literal or var-env-lookup-int
do-math <expression> <math-op> <expression> //add for HW 5
test <expression> <arithmetic-boolean-op> <expression>

Types:
int
boolean

Math-ops:
+,-,*,/ //add for HW 5
% (modulo int division remainder) //add for HW 5

Arithmetic-boolean-ops:
>, >=, <, <=, ==, !=

*** Scratch Paper ***
e = 20;
while(e > 0)
{
  print(e);
  a = 10;
  while(a > 0)
  {
    print(a);
    a = a - 1;
  }
  e = e - 1;
}