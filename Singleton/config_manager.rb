# frozen_string_literal: true

class ConfigManager
  def initialize
    puts "Cargando configuración..."
  end
end

config1 = ConfigManager.new
config2 = ConfigManager.new

puts config1 == config2 # ❌ Devuelve false debido a que son dos instancias distintas
