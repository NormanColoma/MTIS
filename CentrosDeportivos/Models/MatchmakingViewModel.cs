using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;


namespace CentrosDeportivos.Models
{
    public class MatchmakingViewModel
    {
        [RegularExpression("^(([A-Z]\\d{8})|(\\d{8}[A-Z]))$", ErrorMessage = "DNI incorrecto")]
        [Display(Name = "DNI")]
        [Required]
        public string NIF { get; set; }

        [Display(Name = "Fecha de la posible reserva")]
        [Required]
        public string Date { get; set; }

        [Required]
        public string Time { get; set; }

    }
}