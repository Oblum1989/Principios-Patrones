# frozen_string_literal: true

# Solución al problema usando Singleton configurando manualmente la clase
class ConfigManager2
  @instance = nil

  def self.instance
    @instance ||= new
  end

  private_class_method :new # Evita crear instancias con ConfigManager.new

  def initialize
    puts "Cargando configuración..."
    @settings = { theme: "light", language: "en" }
  end

  def get_setting(key)
    @settings[key]
  end
end

config1 = ConfigManager2.instance
config2 = ConfigManager2.instance

puts config1 == config2  # ✅ Devuelve true (es la misma instancia)
puts config1.get_setting(:theme)

# config3 = ConfigManager2.new # monstrará un error porque el method new es privado
