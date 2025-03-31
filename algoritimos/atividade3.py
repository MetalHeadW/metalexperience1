'''Faça um programa que calcule e mostre a área de um triangulo. Sabe-se que: a
Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1760 jardas
Faça um programa que receba uma medida em pés e mostre os resultados:
a) Polegadas
b) Jardas
c) Milhas
'''

#entrada de dados
pes=float(input("medida em pés"))
#processamento
polegadas=pes*12
jardas=pes/3
milhas=jardas/1760
#saida
print("pes em polegadas{}".format(polegadas))
print("pes em jardas{}".format(jardas))
print("pes em milhas{}".format(milhas))