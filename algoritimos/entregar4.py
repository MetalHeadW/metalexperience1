a = int(input("A: "))
b = int(input("B: "))
c = int(input("C: "))

if (a+b >c) and (a+c > b) and (b+c > a):
    if a==b and b==c:
     print("o triangulo é equilátero")
    elif a!=b and a!=c and b!=c:
        print("triangulo escaleno")
    else:
        print("é um triangulo isoceles")
else:
 print("NÃO É UM TRIANGULO VOLTA E FAZ DE NOVO")