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
    public partial class frm36 : Form
    {
        public frm36()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {

            int cuadernos = int.Parse(txtCuaderno.Text);
            int obsequio = 0;
            int pilot = 0;
            int faber = 0;
            int lucas = 0;

            if (cuadernos < 12)
            {
                obsequio = 0;
            }
            if (12 <= cuadernos && cuadernos < 24)
            {
                obsequio = (cuadernos / 4);
                txaObsequio.Text = obsequio + "Lacices lucas";
                //txaObsequio.append(obsequio + "lapiceros lucas");
            }
            if (24 <= cuadernos && cuadernos < 36)
            {
                obsequio = (cuadernos / 4) * 2;
                txaObsequio.Text=(obsequio + "lapiceros faber");
            }
            if (cuadernos >= 36)
            {
                pilot = (cuadernos / 4) * 2;
                faber = cuadernos / 6;
                lucas = cuadernos / 12;
                txaObsequio.Text = (pilot + " lapiceros pilot" + "\n");
                txaObsequio.Text = (faber + " lapiceros faber" + "\n");
                txaObsequio.Text = (lucas + " lapiceros lucas" + "\n");
            }
        }
    }
}
