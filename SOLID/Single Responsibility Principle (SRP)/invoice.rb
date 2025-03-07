# frozen_string_literal: true

class Invoice
  attr_reader :items, :customer_email
  def initialize(items, customer_email)
    @items = items
    @customer_email = customer_email
  end

  def total
    items.sum
  end

  def save_to_database
    puts "Saving invoice with total: #{total} to database..."
  end

  def send_email
    puts "Sending invoice with total: #{total} to #{customer_email}..."
  end
end

# Uso de código
invoice = Invoice.new([100, 200, 50], "customer@example.com")
invoice.save_to_database
invoice.send_email