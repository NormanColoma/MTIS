using System.ComponentModel.DataAnnotations;

namespace CentrosDeportivos.Models
{
    public class PayMethodViewModel
    {
        public string PayMethod { get; set; }
        [Display(Name = "Número tarjeta de crédito")]
        public string CreditCard { get; set; }

        [Display(Name = "Número de la cuenta")]
        public string Iban { get; set; }
    }
}