import numpy as np
import matplotlib.pyplot as plt

# Configurações iniciais
xmin, xmax = -2.5, 1.5
ymin, ymax = -2.0, 2.0
largura, altura = 800, 800
max_iter = 300

# Função para gerar o fractal
def mandelbrot(xmin, xmax, ymin, ymax, largura, altura, max_iter):
    x = np.linspace(xmin, xmax, largura)
    y = np.linspace(ymin, ymax, altura)
    X, Y = np.meshgrid(x, y)
    C = X + 1j * Y
    Z = np.zeros_like(C)
    output = np.zeros(C.shape, dtype=int)

    for i in range(max_iter):
        mask = np.abs(Z) <= 2
        Z[mask] = Z[mask]**2 + C[mask]
        output[mask] = i

    return output

# Função para exibir o fractal
def plot_fractal(xmin, xmax, ymin, ymax):
    plt.clf()
    fractal = mandelbrot(xmin, xmax, ymin, ymax, largura, altura, max_iter)
    plt.imshow(fractal, extent=[xmin, xmax, ymin, ymax], cmap='twilight_shifted', origin='lower')
    plt.title(f"Mandelbrot Zoom\nX:[{xmin:.5f}, {xmax:.5f}] Y:[{ymin:.5f}, {ymax:.5f}]")
    plt.xlabel('Re')
    plt.ylabel('Im')
    plt.draw()

# Função de clique para zoom
def on_click(event):
    global xmin, xmax, ymin, ymax

    if event.xdata is None or event.ydata is None:
        return

    zoom_factor = 0.5  # Fator de zoom (menor = mais zoom in)

    x_click = event.xdata
    y_click = event.ydata

    dx = (xmax - xmin) * zoom_factor / 2
    dy = (ymax - ymin) * zoom_factor / 2

    if event.button == 1:  # Zoom IN com clique esquerdo
        xmin = x_click - dx
        xmax = x_click + dx
        ymin = y_click - dy
        ymax = y_click + dy
    elif event.button == 3:  # Zoom OUT com clique direito
        xmin = x_click - dx * 2
        xmax = x_click + dx * 2
        ymin = y_click - dy * 2
        ymax = y_click + dy * 2

    plot_fractal(xmin, xmax, ymin, ymax)

# Iniciar visualização
plt.figure(figsize=(8, 8))
plot_fractal(xmin, xmax, ymin, ymax)
plt.connect('button_press_event', on_click)
plt.show()