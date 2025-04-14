# Cadastro inicial do produto
nome_produto = input("Informe o nome do produto: ")
quantidade_atual = int(input("Informe a quantidade atual em estoque: "))
quantidade_minima = int(input("Informe a quantidade mínima permitida: "))
quantidade_maxima = int(input("Informe a quantidade máxima permitida: "))

print("\nEscolha a operação:")
print("1 - Adicionar no estoque")
print("2 - Retirar do estoque")
opcao = input("Digite o número da operação desejada: ")

if opcao == "1":
    quantidade_adicionar = int(input("Quantos itens deseja adicionar ao estoque? "))
    if quantidade_atual + quantidade_adicionar > quantidade_maxima:
        print(f"\n❌ Operação não permitida. O estoque excederia o máximo de {quantidade_maxima} unidades.")
    else:
        quantidade_atual += quantidade_adicionar
        print(f"\n✅ Operação realizada com sucesso.")
        print(f"Novo estoque de '{nome_produto}': {quantidade_atual} unidades.")

elif opcao == "2":
    quantidade_retirar = int(input("Quantos itens deseja retirar do estoque? "))
    if quantidade_atual - quantidade_retirar < quantidade_minima:
        print(f"\n❌ Operação não permitida. O estoque ficaria abaixo do mínimo de {quantidade_minima} unidades.")
    else:
        quantidade_atual -= quantidade_retirar
        print(f"\n✅ Operação realizada com sucesso.")
        print(f"Novo estoque de '{nome_produto}': {quantidade_atual} unidades.")
q