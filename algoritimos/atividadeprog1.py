#atividade de imc feita por Mateus Dantas Wendhausen 
 #irei definir a variavel do imc para fazer os cálculos e gerar respostas variadas conforme\
#o usuário digita no programa
def imc(peso, altura):
    imc = peso/ (altura*altura)
    return imc

def class_imc(sexo, peso, altura):
    val_imc = imc(peso,altura)
#aqui defino os valores do imc para o sexo masculino
    if sexo == 'm':
        if val_imc < 20.7:
            return "Abaixo do peso"
        elif val_imc >= 20.7 and val_imc < 26.4:
            return"Peso Normal"
        elif val_imc >= 26.4 and val_imc < 27.8:
            return "Parcialmente acima do peso"
        elif val_imc >= 27.8 and val_imc < 31.1:
            return "Acima do peso"
        elif val_imc >= 31.1:
            return"Obeso"
        else:
            return"Erro no programa"
        
#aqui defino os valores do imc para o sexo feminino-
    if sexo == 'f':
        if val_imc < 19.1:
            return "Abaixo do peso"
        elif val_imc >= 19.1 and val_imc < 25.8:
            return"Peso Normal"
        elif val_imc >= 25.8 and val_imc < 27.3:
            return "Parcialmente acima do peso"
        elif val_imc >= 27.3 and val_imc < 32.3:
            return "Acima do peso"
        elif val_imc >= 32.3:
            return"Obeso"
        else:
            return"Erro no programa"
        
        #vou criar o sistema de imput do usuário

        
        
print('Calculadora de IMC')

valid_sexo = False
while valid_sexo == False:
    sexo = input('Digite o seu sexo (M ou F): ').lower()
    if sexo != 'm' and sexo != 'f':
        print('Dados invalidos, digite M ou F.')
    else:
        valid_sexo = True
        print('\n')

valid_peso = False
while valid_peso == False:
    peso = input ('digite seu peso (exemplo:65.6): ')
    try:
        peso = float(peso)
        if peso <=0 or peso > 350:
            print('Dados inválidos, o numero não pode ser negativo nem inferior a 350')
        else:
            valid_peso = True
            print('\n')

    except:
        print('Peso inválido, use apenas números e separe os decimais apenas com ponto.')

valid_altura = False
while valid_altura == False:
    altura = input ('digite sua altura em metros (exemplo: 1.70): ')
    try:
        altura = float(altura)
        if altura <=0 or altura > 3:
            print('Dados inválidos, o numero não pode ser zetp nem inferior a 3 metros')
        else:
            valid_altura = True
            print('\n')

    except:
        print('Altura inválida, use apenas números e separe os decimais apenas com ponto.')


v_imc = str(imc(peso,altura))
c_imc = class_imc (sexo,peso,altura)

print('O seu IMC é:',v_imc[0:5])
print('A sua classificação é:',c_imc)