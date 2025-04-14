
nomeprod = input("Informe o nome do produto: ")
estoque = int(input("Estoque atual do produto: "))
min = int(input("quantidade minima permitida: "))
quantiMax = int(input("quantidade máxima permitida "))

print("\nEscolha o que quer fazer:")
print("1 - Adicionar no estoque")
print("2 - Retirar do estoque")
opcao = input("o que quer fazer hoje? ")


if opcao == "1":
    addQuanti = int(input("Quantos itens deseja adicionar ao estoque? "))
    if estoque + addQuanti > quantiMax:
        print("O estoque aceita apenas {} unidades.".format(quantiMax))
    else:
      estoque += quantiMax
      print("Operação realizada com sucesso.")
    print("Novo estoque de {} : {} unidades.".format(nomeprod,estoque))
        
elif opcao == "2":
    quantiRemove = int(input("Quantos itens desejaria remover do nosso estoque? "))
    if estoque - quantiRemove < min:
        print("o estoque aceita remover até apenas {} unidades.".format(min))
    else:
        estoque -= quantiRemove
        print("Operação realizada com sucesso.")
        print("Novo estoque de '{}': {} unidades.".format(nomeprod,estoque))
        
else:
    print("Escolha 1  2") 
