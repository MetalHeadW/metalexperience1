def imc(peso, altura):
    return peso / (altura * altura)

def class_imc(sexo, peso, altura):
    val_imc = imc(peso, altura)

    if sexo == 'm':  # Valores para homens
        if val_imc < 20.7:
            return "Abaixo do peso"
        elif val_imc < 26.4:
            return "Peso Normal"
        elif val_imc < 27.8:
            return "Parcialmente acima do peso"
        elif val_imc < 31.1:
            return "Acima do peso"
        else:
            return "Obeso"

    elif sexo == 'f':  # Valores para mulheres
        if val_imc < 19.1:
            return "Abaixo do peso"
        elif val_imc < 25.8:
            return "Peso Normal"
        elif val_imc < 27.3:
            return "Parcialmente acima do peso"
        elif val_imc < 32.3:
            return "Acima do peso"
        else:
            return "Obeso"

# Sistema de input do usuário
print('Calculadora de IMC')

# Validação do sexo
while True:
    sexo = input('Digite o seu sexo (M ou F): ').strip().lower()
    if sexo in ('m', 'f'):
        break
    print('Dados inválidos, digite M ou F.')

# Validação do peso
while True:
    try:
        peso = float(input('Digite seu peso (exemplo: 65.6): '))
        if 0 < peso <= 350:
            break
        print('Dados inválidos, o peso deve estar entre 0 e 350 kg.')
    except ValueError:
        print('Peso inválido, use apenas números e separe os decimais com ponto.')

# Validação da altura
while True:
    try:
        altura = float(input('Digite sua altura em metros (exemplo: 1.70): '))
        if 0 < altura <= 3:
            break
        print('Dados inválidos, a altura deve estar entre 0 e 3 metros.')
    except ValueError:
        print('Altura inválida, use apenas números e separe os decimais com ponto.')

# Cálculo do IMC
v_imc = round(imc(peso, altura), 2)
c_imc = class_imc(sexo, peso, altura)

# Exibição dos resultados
print(f'\nO seu IMC é: {v_imc}')
print(f'A sua classificação é: {c_imc}')
