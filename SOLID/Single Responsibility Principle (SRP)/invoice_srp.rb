# frozen_string_literal: true

class InvoiceSRP
  attr_reader :items

  def initialize(items)
    @items = items
  end

  def total
    items.sum
  end
end

class InvoiceRepository
  def save(invoice)
    puts "Saving invoice with total: #{invoice.total} to database..."
  end
end

class InvoiceMailer
  def send_invoice(customer_email, invoice)
    puts "Sending invoice with total: #{invoice.total} to #{customer_email}..."
  end
end

class InvoiceApp
  def self.run
    invoice = InvoiceSRP.new([100, 200, 50])

    repository = InvoiceRepository.new
    repository.save(invoice)

    mailer = InvoiceMailer.new
    mailer.send_invoice("customer@example.com", invoice)
  end
end

InvoiceApp.run