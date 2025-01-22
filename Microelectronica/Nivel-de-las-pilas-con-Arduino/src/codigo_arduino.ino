#include <Wire.h>
#include <LiquidCrystal_I2C.h>

// Pines para los LEDs
#define LEDVERDE 2
#define LEDAMARILLO 3
#define LEDROJO 4
#define ANALOGPILA 0

// Inicializamos la pantalla LCD con la dirección I2C (generalmente 0x27)
LiquidCrystal_I2C lcd(0x27, 16, 2);

// Variables
int analogValor = 0;
float voltaje = 0;
int ledDelay = 800;

// Umbrales
float maximo = 1.6;
float medio = 1.4;
float minimo = 0.3;

void setup() {
  // Inicializamos el monitor serie
  Serial.begin(9600);

  // Inicializamos la LCD
  lcd.init();
  lcd.backlight();

  // Configuración de los pines de los LEDs
  pinMode(LEDVERDE, OUTPUT);
  pinMode(LEDAMARILLO, OUTPUT);
  pinMode(LEDROJO, OUTPUT);

  // Mensaje inicial en la LCD
  lcd.setCursor(0, 0); // Primera línea
  lcd.print("Voltaje: ");
}

void loop() {
  // Leer el valor analógico
  analogValor = analogRead(ANALOGPILA);

  // Calcular el voltaje
  voltaje = 0.0048 * analogValor;
  
  // Mostrar voltaje en el monitor serie
  Serial.print("Voltaje: ");
  Serial.println(voltaje);

  // Mostrar voltaje en la LCD
  lcd.setCursor(0, 1); // Segunda línea
  lcd.print(voltaje);
  lcd.print(" V     "); // Espacios para borrar valores anteriores

  // Controlar los LEDs según el voltaje
  if (voltaje >= maximo) {
    digitalWrite(LEDVERDE, HIGH);
    delay(ledDelay);
    digitalWrite(LEDVERDE, LOW);
  }
  else if (voltaje < maximo && voltaje > medio) {
    digitalWrite(LEDAMARILLO, HIGH);
    delay(ledDelay);
    digitalWrite(LEDAMARILLO, LOW);
  }
  else if (voltaje < medio && voltaje > minimo) {
    digitalWrite(LEDROJO, HIGH);
    delay(ledDelay);
    digitalWrite(LEDROJO, LOW);
  }

  // Apagar todos los LEDs
  digitalWrite(LEDVERDE, LOW);
  digitalWrite(LEDAMARILLO, LOW);
  digitalWrite(LEDROJO, LOW);
}