qtd = int(input("Quantos alunos tem em sua escola?"))
for i in range(qtd):
    nome = input("Qual o nome do aluno?")
    n1 = float(input("Digite a nota 1"))
    n2 = float(input("Digite a nota 2"))
    n3 = float(input("Digite a nota 3"))
    media = (n1+n2+n3)/3
    if media >= 6:
        print("{} está Aprovado!".format(nome))
    else:
        print("{} está Reprovado!".format(nome))