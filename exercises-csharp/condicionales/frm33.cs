using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Fp.condicionales
{
    public partial class frm33 : Form
    {
        public frm33()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int tardanzas = int.Parse(txtTardanzas.Text);
            int observaciones = int.Parse(txtObservaciones.Text);

            if (tardanzas == 0) tardanzas = 10;
            if (tardanzas == 1 || tardanzas == 2) tardanzas = 8;
            if (3 <= tardanzas && tardanzas < 6) tardanzas = 6;
            if (6 <= tardanzas && tardanzas < 10) tardanzas = 4;
            else tardanzas = 0;

            if (observaciones == 0) observaciones = 10;
            if (observaciones == 1) observaciones = 8;
            if (observaciones == 2) observaciones = 5;
            if (observaciones == 3) observaciones = 1;
            else observaciones = 0;

            int puntaje = observaciones + tardanzas;

            double bonificacion = 0;
            if (puntaje < 11) bonificacion = puntaje * 2.5;
            if (11 <= puntaje && puntaje <= 13) bonificacion = puntaje * 5;
            if (14 <= puntaje && puntaje <= 16) bonificacion = puntaje * 7.5;
            if (17 <= puntaje && puntaje <= 19) bonificacion = puntaje * 10;
            else bonificacion = 20 * 12.5;


            txtPuntaje.Text = (puntaje + "");
            txtBonificaciones.Text = bonificacion.ToString("0.#0");

        }
    }
}
