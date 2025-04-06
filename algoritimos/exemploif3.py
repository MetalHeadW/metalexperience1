nota1 = float(input("insira a nota 1: "))
nota2 = float(input("insira a nota 2: "))
nota3 = float(input("insira a nota 3: "))
aulas = int(input('insira a quantidade de aulas'))
faltas = int(input('insira a quantidade de faltas'))

media = (nota1 + nota2 + nota3)/3
pcfreq = 100 - (faltas / aulas)*100
#pcfreq = 100 - (freq2/freq1*100)
if media >= 7 and pcfreq >= 75:
    print("aprovado")
elif media >= 3 and media < 7 and pcfreq >= 75:
    print("recuperação") 
else:
    print("aprovado")
