import numpy as np
import matplotlib.pyplot as plt

# Parâmetros iniciais
xmin, xmax = -2.0, 1.0
ymin, ymax = -1.5, 1.5
largura, altura = 800, 800
max_iter = 200

# Função para calcular Mandelbrot
def mandelbrot(xmin, xmax, ymin, ymax, largura, altura, max_iter):
    x = np.linspace(xmin, xmax, largura)
    y = np.linspace(ymin, ymax, altura)
    X, Y = np.meshgrid(x, y)
    C = X + 1j * Y
    Z = np.zeros_like(C)
    output = np.zeros(C.shape, dtype=int)

    for i in range(max_iter):
        mask = np.abs(Z) <= 2
        Z[mask] = Z[mask] ** 2 + C[mask]
        output[mask] += 1

    return output

# Função de plot
def plot_fractal(xmin, xmax, ymin, ymax):
    plt.clf()
    fractal = mandelbrot(xmin, xmax, ymin, ymax, largura, altura, max_iter)
    plt.imshow(fractal, extent=[xmin, xmax, ymin, ymax], cmap='inferno', origin='lower')
    plt.title(f"Mandelbrot Zoom\nX:[{xmin:.5f}, {xmax:.5f}] Y:[{ymin:.5f}, {ymax:.5f}]")
    plt.xlabel('Re')
    plt.ylabel('Im')
    plt.draw()

# Evento de clique para zoom
def on_click(event):
    global xmin, xmax, ymin, ymax

    if event.button == 1:  # Botão esquerdo → Zoom IN
        x_click = event.xdata
        y_click = event.ydata

        if x_click is None or y_click is None:
            return

        zoom_factor = 0.5  # 50% do tamanho atual (zoom in)

        dx = (xmax - xmin) * zoom_factor / 2
        dy = (ymax - ymin) * zoom_factor / 2

        xmin = x_click - dx
        xmax = x_click + dx
        ymin = y_click - dy
        ymax = y_click + dy

        plot_fractal(xmin, xmax, ymin, ymax)

    elif event.button == 3:  # Botão direito → Zoom OUT
        x_click = event.xdata
        y_click = event.ydata

        if x_click is None or y_click is None:
            return

        zoom_factor = 2.0  # Volta para fora

        dx = (xmax - xmin) * zoom_factor / 2
        dy = (ymax - ymin) * zoom_factor / 2

        xmin = x_click - dx
        xmax = x_click + dx
        ymin = y_click - dy
        ymax = y_click + dy

        plot_fractal(xmin, xmax, ymin, ymax)

# Configura janela interativa
plt.figure(figsize=(8, 8))
plot_fractal(xmin, xmax, ymin, ymax)
plt.connect('button_press_event', on_click)
plt.show()
