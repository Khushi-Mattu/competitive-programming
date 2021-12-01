x=input()
l=[]
for i in range(0,len(x)):
    x=x[len(x)-1]+x[:len(x)-1]
    l.append(x)
l=set(l)
print(len(l))
