'''escreva um programa, que entra duas datas, e determine qual delas ocorreu cronológicamente primeiro, cada data é composta por 3 numeros
inteiros, cada um representando o dia, outro o mes, e outro o ano'''

dia1 = int(input("digite um dia do mês: "))
mes1 = int(input("digite um mês do ano: "))
ano1 = int(input("digite um ano: "))
dia2 = int(input("digite um dia do mês: "))
mes2 = int(input("digite um mês do ano: "))
ano2 = int(input("digite um ano: "))

if ano1 < ano2:
    print("a data 1 aconteceu primero")
elif ano2 < ano1:
    print("a data 2 ocorreu primeiro")
else:
   if mes1 < mes2:
    print("a data 1 aconteceu primero")
   elif mes2 < mes1:
    print("a data 2 ocorreu primeiro")
   else:
       if dia1 < dia2:
        print("a data 1 aconteceu primero")
       elif dia2 < dia1:
        print("a data 2 ocorreu primeiro")
       else:
           print("as datas são iguais")

    