y=''
L=[]
x=input()
1 <= int(x) <= 10^18
for i in range(1,len(x)):
    if int(x[i])>5:
        digit=9-int(x[i])
    else:
        digit=int(x[i])
    L.append(str(digit)
if x[0]=='9':
    digit1='9'
elif 9>int(x[0])>5:
    digit1=str(9-int(x[0]))
else:
    digit1=x[0]
for i in range(len(L)):
    y=y+L[i]
print(y+digit1)
