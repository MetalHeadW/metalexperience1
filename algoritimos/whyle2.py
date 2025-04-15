orcamento = float(input("Qual o valor você tem para gastar? "))

while orcamento > 0:
    vl = float(input("qual o valor da compra? "))
    orcamento -= vl
    print('Resta R$', orcamento)
print("TA POBRE OTÁRIO")