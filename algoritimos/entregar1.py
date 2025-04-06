'''escreva um programa que lê três numeros inteiros e mostre o maior'''
print("")
num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))
num3 = int(input("Digite o terceiro número: "))
print("")
if num1 > num2 and num1 > num3:
    print("numero {} é maior que os outros numeros".format(num1))
elif num2 > num1 and num2 > num3:
    print("numero {} é maior que os outros numeros".format(num2))
elif num3 > num1 and num3 > num1:
    print("numero {} é maior que os outros numeros".format(num3))
else:
    print("todos os numeros são iguais")