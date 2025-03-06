# frozen_string_literal: true

# Solución al problema usando Singleton que viene en la librería estándar de Ruby
require 'singleton'

class ConfigManager1
  include Singleton

  def initialize
    puts "Cargando configuración..."
    @settings = { theme: "dark", language: "es" }
  end

  def get_setting(key)
    @settings[key]
  end
end

config1 = ConfigManager1.instance
config2 = ConfigManager1.instance

puts config1 == config2 # ✅ Devuelve true (es la misma instancia)

puts config1.get_setting(:theme) # "dark"
