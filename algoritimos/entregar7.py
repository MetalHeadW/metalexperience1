anoNasc = int(input("Ano que você nasceu"))
mesNasc = int(input("Mes que você nasceu"))
anoAtu = int(input("Ano atual"))
mesAtu = int(input("Mês atual"))

if mesNasc == mesAtu:
    print("Mês de Aniversário")
    
idade = anoAtu - anoNasc
    
if mesAtu < mesNasc:
    idade = idade - 1
        
    print("sua idade é {} anos".format(idade))