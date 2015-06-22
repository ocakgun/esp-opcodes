/* Automatically generated by parse-opcodes */
package hwacha

import Chisel._

object HwachaInstructions {
  def VSETCFG            = Bits("b?????????????????010000000001011")
  def VSETVL             = Bits("b000000000000?????110?????0001011")
  def VGETCFG            = Bits("b00000000000000000100?????0001011")
  def VGETVL             = Bits("b00000010000000000100?????0001011")
  def VUNCFG             = Bits("b00000100000000000000000000001011")
  def VMSS               = Bits("b000001000????????010?????0101011")
  def VMSA               = Bits("b000001100000?????010?????0101011")
  def VF                 = Bits("b???????10000?????010?????0101011")
  def VFT                = Bits("b???????10001?????010?????0101011")
  def VXCPTCAUSE         = Bits("b00000000000000000100?????0101011")
  def VXCPTAUX           = Bits("b00000010000000000100?????0101011")
  def VXCPTSAVE          = Bits("b000000000000?????011000000101011")
  def VXCPTRESTORE       = Bits("b000000100000?????011000000101011")
  def VXCPTKILL          = Bits("b00000100000000000011000000101011")
  def VXCPTEVAC          = Bits("b000001100000?????011000000101011")
  def VXCPTHOLD          = Bits("b000010000000?????011000000101011")
  def VENQCMD            = Bits("b0000101??????????011000000101011")
  def VENQIMM1           = Bits("b0000110??????????011000000101011")
  def VENQIMM2           = Bits("b0000111??????????011000000101011")
  def VENQCNT            = Bits("b0001000??????????011000000101011")
}
object HwachaElementInstructions {
  def VEIDX              = Bits("b1?00000001011000000000000000000?????????????????????011000111111")
  def VFIRST             = Bits("b0010000001111000000000000000000?????????????????????011000111111")
  def VSTOP              = Bits("b0000000000000000000000000000000000000000000000000000110000111111")
  def VFENCE             = Bits("b0000000000100000000000000000000000000000????????0000110000111111")
  def VCJAL              = Bits("b????????????????????????????????00000000????????????110110111111")
  def VCJALR             = Bits("b????????????????????????????????????????????????????110010111111")
  def VLUI               = Bits("b????????????????????????????????00000000????????0000011010111111")
  def VAUIPC             = Bits("b????????????????????????????????00000000????????0000001010111111")
  def VADDI              = Bits("b????????????????????????????????????????????????0000001000111111")
  def VSLTI              = Bits("b????????????????????????????????????????????????0010001000111111")
  def VSLTIU             = Bits("b????????????????????????????????????????????????0011001000111111")
  def VANDI              = Bits("b????????????????????????????????????????????????0111001000111111")
  def VORI               = Bits("b????????????????????????????????????????????????0110001000111111")
  def VXORI              = Bits("b????????????????????????????????????????????????0100001000111111")
  def VSLLI              = Bits("b00000000000000000000000000??????????????????????0001001000111111")
  def VSRLI              = Bits("b00000000000000000000000000??????????????????????0101001000111111")
  def VSRAI              = Bits("b00000100000000000000000000??????????????????????0101001000111111")
  def VADDIW             = Bits("b????????????????????????????????????????????????0000001100111111")
  def VSLLIW             = Bits("b000000000000000000000000000?????????????????????0001001100111111")
  def VSRLIW             = Bits("b000000000000000000000000000?????????????????????0101001100111111")
  def VSRAIW             = Bits("b000001000000000000000000000?????????????????????0101001100111111")
  def VPL                = Bits("b1000000000000010000000000000000?000?????0000????????101100111111")
  def VPS                = Bits("b1000000000000010000000000000000?000?????0000????????111100111111")
  def VCMPEQ             = Bits("b1??00000000000100000000?????????????????0000????????011000111111")
  def VCMPLT             = Bits("b1??00000000100100000000?????????????????0000????????011000111111")
  def VCMPLTU            = Bits("b1??00000000110100000000?????????????????0000????????011000111111")
  def VCMPFLE_D          = Bits("b1??00000101000000010100?????????????????0000????????011000111111")
  def VCMPFLT_D          = Bits("b1??00000101001000010100?????????????????0000????????011000111111")
  def VCMPFEQ_D          = Bits("b1??00000101010000010100?????????????????0000????????011000111111")
  def VCMPFLE_S          = Bits("b1??00000000000000010100?????????????????0000????????011000111111")
  def VCMPFLT_S          = Bits("b1??00000000001000010100?????????????????0000????????011000111111")
  def VCMPFEQ_S          = Bits("b1??00000000010000010100?????????????????0000????????011000111111")
  def VCMPFLE_H          = Bits("b1??00001010000000010100?????????????????0000????????011000111111")
  def VCMPFLT_H          = Bits("b1??00001010001000010100?????????????????0000????????011000111111")
  def VCMPFEQ_H          = Bits("b1??00001010010000010100?????????????????0000????????011000111111")
  def VPOP               = Bits("b100001????????10000????0000?????0000????0000????????011000111111")
  def VLSEGD             = Bits("b10000000000???00000011000000000?000?????????????????101100111111")
  def VLSEGW             = Bits("b10000000000???00000010000000000?000?????????????????101100111111")
  def VLSEGWU            = Bits("b10000000000???00000110000000000?000?????????????????101100111111")
  def VLSEGH             = Bits("b10000000000???00000001000000000?000?????????????????101100111111")
  def VLSEGHU            = Bits("b10000000000???00000101000000000?000?????????????????101100111111")
  def VLSEGB             = Bits("b10000000000???00000000000000000?000?????????????????101100111111")
  def VLSEGBU            = Bits("b10000000000???00000100000000000?000?????????????????101100111111")
  def VLSEGSTD           = Bits("b10000000000???000000111000??????000?????????????????101100111111")
  def VLSEGSTW           = Bits("b10000000000???000000101000??????000?????????????????101100111111")
  def VLSEGSTWU          = Bits("b10000000000???000001101000??????000?????????????????101100111111")
  def VLSEGSTH           = Bits("b10000000000???000000011000??????000?????????????????101100111111")
  def VLSEGSTHU          = Bits("b10000000000???000001011000??????000?????????????????101100111111")
  def VLSEGSTB           = Bits("b10000000000???000000001000??????000?????????????????101100111111")
  def VLSEGSTBU          = Bits("b10000000000???000001001000??????000?????????????????101100111111")
  def VSSEGD             = Bits("b10000000000???00000011000000000?000?????????????????111100111111")
  def VSSEGW             = Bits("b10000000000???00000010000000000?000?????????????????111100111111")
  def VSSEGH             = Bits("b10000000000???00000001000000000?000?????????????????111100111111")
  def VSSEGB             = Bits("b10000000000???00000000000000000?000?????????????????111100111111")
  def VSSEGSTD           = Bits("b10000000000???000000111000??????000?????????????????111100111111")
  def VSSEGSTW           = Bits("b10000000000???000000101000??????000?????????????????111100111111")
  def VSSEGSTH           = Bits("b10000000000???000000011000??????000?????????????????111100111111")
  def VSSEGSTB           = Bits("b10000000000???000000001000??????000?????????????????111100111111")
  def VLSEGXD            = Bits("b10100000000???000000110?????????????????????????????101100111111")
  def VLSEGXW            = Bits("b10100000000???000000100?????????????????????????????101100111111")
  def VLSEGXWU           = Bits("b10100000000???000001100?????????????????????????????101100111111")
  def VLSEGXH            = Bits("b10100000000???000000010?????????????????????????????101100111111")
  def VLSEGXHU           = Bits("b10100000000???000001010?????????????????????????????101100111111")
  def VLSEGXB            = Bits("b10100000000???000000000?????????????????????????????101100111111")
  def VLSEGXBU           = Bits("b10100000000???000001000?????????????????????????????101100111111")
  def VSSEGXD            = Bits("b10100000000???000000110?????????????????????????????111100111111")
  def VSSEGXW            = Bits("b10100000000???000000100?????????????????????????????111100111111")
  def VSSEGXH            = Bits("b10100000000???000000010?????????????????????????????111100111111")
  def VSSEGXB            = Bits("b10100000000???000000000?????????????????????????????111100111111")
  def VLSSEGD            = Bits("b00000000000???000000110000000000????????????????0000101100111111")
  def VLSSEGW            = Bits("b00000000000???000000100000000000????????????????0000101100111111")
  def VLSSEGWU           = Bits("b00000000000???000001100000000000????????????????0000101100111111")
  def VLSSEGH            = Bits("b00000000000???000000010000000000????????????????0000101100111111")
  def VLSSEGHU           = Bits("b00000000000???000001010000000000????????????????0000101100111111")
  def VLSSEGB            = Bits("b00000000000???000000000000000000????????????????0000101100111111")
  def VLSSEGBU           = Bits("b00000000000???000001000000000000????????????????0000101100111111")
  def VSSSEGD            = Bits("b00000000000???000000110????????0????????000000000000111100111111")
  def VSSSEGW            = Bits("b00000000000???000000100????????0????????000000000000111100111111")
  def VSSSEGH            = Bits("b00000000000???000000010????????0????????000000000000111100111111")
  def VSSSEGB            = Bits("b00000000000???000000000????????0????????000000000000111100111111")
  def VLASEGD            = Bits("b00000000001???000000110000000000000?????????????0000101100111111")
  def VLASEGW            = Bits("b00000000001???000000100000000000000?????????????0000101100111111")
  def VLASEGWU           = Bits("b00000000001???000001100000000000000?????????????0000101100111111")
  def VLASEGH            = Bits("b00000000001???000000010000000000000?????????????0000101100111111")
  def VLASEGHU           = Bits("b00000000001???000001010000000000000?????????????0000101100111111")
  def VLASEGB            = Bits("b00000000001???000000000000000000000?????????????0000101100111111")
  def VLASEGBU           = Bits("b00000000001???000001000000000000000?????????????0000101100111111")
  def VSASEGD            = Bits("b00000000001???000000110????????0000?????000000000000111100111111")
  def VSASEGW            = Bits("b00000000001???000000100????????0000?????000000000000111100111111")
  def VSASEGH            = Bits("b00000000001???000000010????????0000?????000000000000111100111111")
  def VSASEGB            = Bits("b00000000001???000000000????????0000?????000000000000111100111111")
  def VADD               = Bits("b???00000000000000000000?????????????????????????????011000111111")
  def VADDU              = Bits("b???01000000000000000000?????????????????????????????011000111111")
  def VSUB               = Bits("b???00100000000000000000?????????????????????????????011000111111")
  def VSLL               = Bits("b???00000000001000000000?????????????????????????????011000111111")
  def VSLT               = Bits("b???00000000010000000000?????????????????????????????011000111111")
  def VSLTU              = Bits("b???00000000011000000000?????????????????????????????011000111111")
  def VXOR               = Bits("b???00000000100000000000?????????????????????????????011000111111")
  def VSRL               = Bits("b???00000000101000000000?????????????????????????????011000111111")
  def VSRA               = Bits("b???00100000101000000000?????????????????????????????011000111111")
  def VOR                = Bits("b???00000000110000000000?????????????????????????????011000111111")
  def VAND               = Bits("b???00000000111000000000?????????????????????????????011000111111")
  def VADDW              = Bits("b???00000000000000000000?????????????????????????????011100111111")
  def VSUBW              = Bits("b???00100000000000000000?????????????????????????????011100111111")
  def VSLLW              = Bits("b???00000000001000000000?????????????????????????????011100111111")
  def VSRLW              = Bits("b???00000000101000000000?????????????????????????????011100111111")
  def VSRAW              = Bits("b???00100000101000000000?????????????????????????????011100111111")
  def VMUL               = Bits("b???00000001000000000000?????????????????????????????011000111111")
  def VMULH              = Bits("b???00000001001000000000?????????????????????????????011000111111")
  def VMULHSU            = Bits("b???00000001010000000000?????????????????????????????011000111111")
  def VMULHU             = Bits("b???00000001011000000000?????????????????????????????011000111111")
  def VDIV               = Bits("b???00000001100000000000?????????????????????????????011000111111")
  def VDIVU              = Bits("b???00000001101000000000?????????????????????????????011000111111")
  def VREM               = Bits("b???00000001110000000000?????????????????????????????011000111111")
  def VREMU              = Bits("b???00000001111000000000?????????????????????????????011000111111")
  def VMULW              = Bits("b???00000001000000000000?????????????????????????????011100111111")
  def VDIVW              = Bits("b???00000001100000000000?????????????????????????????011100111111")
  def VDIVUW             = Bits("b???00000001101000000000?????????????????????????????011100111111")
  def VREMW              = Bits("b???00000001110000000000?????????????????????????????011100111111")
  def VREMUW             = Bits("b???00000001111000000000?????????????????????????????011100111111")
  def VAMOADD_W          = Bits("b???000000??010000000000?????????????????????????????010110111111")
  def VAMOXOR_W          = Bits("b???000100??010000000000?????????????????????????????010110111111")
  def VAMOOR_W           = Bits("b???001000??010000000000?????????????????????????????010110111111")
  def VAMOAND_W          = Bits("b???001100??010000000000?????????????????????????????010110111111")
  def VAMOMIN_W          = Bits("b???010000??010000000000?????????????????????????????010110111111")
  def VAMOMAX_W          = Bits("b???010100??010000000000?????????????????????????????010110111111")
  def VAMOMINU_W         = Bits("b???011000??010000000000?????????????????????????????010110111111")
  def VAMOMAXU_W         = Bits("b???011100??010000000000?????????????????????????????010110111111")
  def VAMOSWAP_W         = Bits("b???000001??010000000000?????????????????????????????010110111111")
  def VAMOADD_D          = Bits("b???000000??011000000000?????????????????????????????010110111111")
  def VAMOXOR_D          = Bits("b???000100??011000000000?????????????????????????????010110111111")
  def VAMOOR_D           = Bits("b???001000??011000000000?????????????????????????????010110111111")
  def VAMOAND_D          = Bits("b???001100??011000000000?????????????????????????????010110111111")
  def VAMOMIN_D          = Bits("b???010000??011000000000?????????????????????????????010110111111")
  def VAMOMAX_D          = Bits("b???010100??011000000000?????????????????????????????010110111111")
  def VAMOMINU_D         = Bits("b???011000??011000000000?????????????????????????????010110111111")
  def VAMOMAXU_D         = Bits("b???011100??011000000000?????????????????????????????010110111111")
  def VAMOSWAP_D         = Bits("b???000001??011000000000?????????????????????????????010110111111")
  def VFADD_S            = Bits("b???00000000???000000000?????????????????????????????101000111111")
  def VFSUB_S            = Bits("b???00000000???000000001?????????????????????????????101000111111")
  def VFMUL_S            = Bits("b???00000000???000000010?????????????????????????????101000111111")
  def VFDIV_S            = Bits("b???00000000???000000011?????????????????????????????101000111111")
  def VFSGNJ_S           = Bits("b???00000000000000000100?????????????????????????????101000111111")
  def VFSGNJN_S          = Bits("b???00000000001000000100?????????????????????????????101000111111")
  def VFSGNJX_S          = Bits("b???00000000010000000100?????????????????????????????101000111111")
  def VFMIN_S            = Bits("b???00000000000000000101?????????????????????????????101000111111")
  def VFMAX_S            = Bits("b???00000000001000000101?????????????????????????????101000111111")
  def VFSQRT_S           = Bits("b??000000000???00000101100000000?????????????????????101000111111")
  def VFCVT_W_S          = Bits("b??000000000???00001100000000000?????????????????????101000111111")
  def VFCVT_WU_S         = Bits("b??000000100???00001100000000000?????????????????????101000111111")
  def VFCVT_L_S          = Bits("b??000001000???00001100000000000?????????????????????101000111111")
  def VFCVT_LU_S         = Bits("b??000001100???00001100000000000?????????????????????101000111111")
  def VFCVT_S_W          = Bits("b??000000000???00001101000000000?????????????????????101000111111")
  def VFCVT_S_WU         = Bits("b??000000100???00001101000000000?????????????????????101000111111")
  def VFCVT_S_L          = Bits("b??000001000???00001101000000000?????????????????????101000111111")
  def VFCVT_S_LU         = Bits("b??000001100???00001101000000000?????????????????????101000111111")
  def VFCLASS_S          = Bits("b??00000000000100001110000000000?????????????????????101000111111")
  def VFMADD_S           = Bits("b????0000000???0?????????????????????????????????????100000111111")
  def VFMSUB_S           = Bits("b????0000000???0?????????????????????????????????????100010111111")
  def VFNMSUB_S          = Bits("b????0000000???0?????????????????????????????????????100100111111")
  def VFNMADD_S          = Bits("b????0000000???0?????????????????????????????????????100110111111")
  def VFADD_D            = Bits("b???00000101???000000000?????????????????????????????101000111111")
  def VFSUB_D            = Bits("b???00000101???000000001?????????????????????????????101000111111")
  def VFMUL_D            = Bits("b???00000101???000000010?????????????????????????????101000111111")
  def VFDIV_D            = Bits("b???00000101???000000011?????????????????????????????101000111111")
  def VFSGNJ_D           = Bits("b???00000101000000000100?????????????????????????????101000111111")
  def VFSGNJN_D          = Bits("b???00000101001000000100?????????????????????????????101000111111")
  def VFSGNJX_D          = Bits("b???00000101010000000100?????????????????????????????101000111111")
  def VFMIN_D            = Bits("b???00000101000000000101?????????????????????????????101000111111")
  def VFMAX_D            = Bits("b???00000101001000000101?????????????????????????????101000111111")
  def VFSQRT_D           = Bits("b??000000001???00000101100000000?????????????????????101000111111")
  def VFCVT_S_D          = Bits("b??000000001???00000100000000000?????????????????????101000111111")
  def VFCVT_D_S          = Bits("b??000000100???00000100000000000?????????????????????101000111111")
  def VFCVT_W_D          = Bits("b??000000001???00001100000000000?????????????????????101000111111")
  def VFCVT_WU_D         = Bits("b??000000101???00001100000000000?????????????????????101000111111")
  def VFCVT_L_D          = Bits("b??000001001???00001100000000000?????????????????????101000111111")
  def VFCVT_LU_D         = Bits("b??000001101???00001100000000000?????????????????????101000111111")
  def VFCVT_D_W          = Bits("b??000000001???00001101000000000?????????????????????101000111111")
  def VFCVT_D_WU         = Bits("b??000000101???00001101000000000?????????????????????101000111111")
  def VFCVT_D_L          = Bits("b??000001001???00001101000000000?????????????????????101000111111")
  def VFCVT_D_LU         = Bits("b??000001101???00001101000000000?????????????????????101000111111")
  def VFCLASS_D          = Bits("b??00000010100100001110000000000?????????????????????101000111111")
  def VFMADD_D           = Bits("b????0000101???0?????????????????????????????????????100000111111")
  def VFMSUB_D           = Bits("b????0000101???0?????????????????????????????????????100010111111")
  def VFNMSUB_D          = Bits("b????0000101???0?????????????????????????????????????100100111111")
  def VFNMADD_D          = Bits("b????0000101???0?????????????????????????????????????100110111111")
  def VFADD_H            = Bits("b???00001010???000000000?????????????????????????????101000111111")
  def VFSUB_H            = Bits("b???00001010???000000001?????????????????????????????101000111111")
  def VFMUL_H            = Bits("b???00001010???000000010?????????????????????????????101000111111")
  def VFDIV_H            = Bits("b???00001010???000000011?????????????????????????????101000111111")
  def VFSGNJ_H           = Bits("b???00001010000000000100?????????????????????????????101000111111")
  def VFSGNJN_H          = Bits("b???00001010001000000100?????????????????????????????101000111111")
  def VFSGNJX_H          = Bits("b???00001010010000000100?????????????????????????????101000111111")
  def VFMIN_H            = Bits("b???00001010000000000101?????????????????????????????101000111111")
  def VFMAX_H            = Bits("b???00001010001000000101?????????????????????????????101000111111")
  def VFSQRT_H           = Bits("b??000001010???00000101100000000?????????????????????101000111111")
  def VFCVT_D_H          = Bits("b??000000010???00000100000000000?????????????????????101000111111")
  def VFCVT_H_D          = Bits("b??000001000???00000100000000000?????????????????????101000111111")
  def VFCVT_S_H          = Bits("b??000000110???00000100000000000?????????????????????101000111111")
  def VFCVT_H_S          = Bits("b??000001001???00000100000000000?????????????????????101000111111")
  def VFCVT_W_H          = Bits("b??000000010???00001100000000000?????????????????????101000111111")
  def VFCVT_WU_H         = Bits("b??000000110???00001100000000000?????????????????????101000111111")
  def VFCVT_L_H          = Bits("b??000001010???00001100000000000?????????????????????101000111111")
  def VFCVT_LU_H         = Bits("b??000001110???00001100000000000?????????????????????101000111111")
  def VFCVT_H_W          = Bits("b??000000010???00001101000000000?????????????????????101000111111")
  def VFCVT_H_WU         = Bits("b??000000110???00001101000000000?????????????????????101000111111")
  def VFCVT_H_L          = Bits("b??000001010???00001101000000000?????????????????????101000111111")
  def VFCVT_H_LU         = Bits("b??000001110???00001101000000000?????????????????????101000111111")
  def VFCLASS_H          = Bits("b??00000101000100001110000000000?????????????????????101000111111")
  def VFMADD_H           = Bits("b????0001010???0?????????????????????????????????????100000111111")
  def VFMSUB_H           = Bits("b????0001010???0?????????????????????????????????????100010111111")
  def VFNMSUB_H          = Bits("b????0001010???0?????????????????????????????????????100100111111")
  def VFNMADD_H          = Bits("b????0001010???0?????????????????????????????????????100110111111")
  def VFADD_S_H          = Bits("b???00000110???000000000?????????????????????????????101000111111")
  def VFSUB_S_H          = Bits("b???00000110???000000001?????????????????????????????101000111111")
  def VFMUL_S_H          = Bits("b???00000110???000000010?????????????????????????????101000111111")
  def VFADD_D_H          = Bits("b???00000010???000000000?????????????????????????????101000111111")
  def VFSUB_D_H          = Bits("b???00000010???000000001?????????????????????????????101000111111")
  def VFMUL_D_H          = Bits("b???00000010???000000010?????????????????????????????101000111111")
  def VFMADD_D_H         = Bits("b????0000010???0?????????????????????????????????????100000111111")
  def VFMSUB_D_H         = Bits("b????0000010???0?????????????????????????????????????100010111111")
  def VFNMSUB_D_H        = Bits("b????0000010???0?????????????????????????????????????100100111111")
  def VFNMADD_D_H        = Bits("b????0000010???0?????????????????????????????????????100110111111")
  def VFADD_D_S          = Bits("b???00000001???000000000?????????????????????????????101000111111")
  def VFSUB_D_S          = Bits("b???00000001???000000001?????????????????????????????101000111111")
  def VFMUL_D_S          = Bits("b???00000001???000000010?????????????????????????????101000111111")
  def VLD                = Bits("b1000000000000000000011000000000?000?????????????????101100111111")
  def VLW                = Bits("b1000000000000000000010000000000?000?????????????????101100111111")
  def VLWU               = Bits("b1000000000000000000110000000000?000?????????????????101100111111")
  def VLH                = Bits("b1000000000000000000001000000000?000?????????????????101100111111")
  def VLHU               = Bits("b1000000000000000000101000000000?000?????????????????101100111111")
  def VLB                = Bits("b1000000000000000000000000000000?000?????????????????101100111111")
  def VLBU               = Bits("b1000000000000000000100000000000?000?????????????????101100111111")
  def VLSTD              = Bits("b10000000000000000000111000??????000?????????????????101100111111")
  def VLSTW              = Bits("b10000000000000000000101000??????000?????????????????101100111111")
  def VLSTWU             = Bits("b10000000000000000001101000??????000?????????????????101100111111")
  def VLSTH              = Bits("b10000000000000000000011000??????000?????????????????101100111111")
  def VLSTHU             = Bits("b10000000000000000001011000??????000?????????????????101100111111")
  def VLSTB              = Bits("b10000000000000000000001000??????000?????????????????101100111111")
  def VLSTBU             = Bits("b10000000000000000001001000??????000?????????????????101100111111")
  def VSD                = Bits("b1000000000000000000011000000000?000?????????????????111100111111")
  def VSW                = Bits("b1000000000000000000010000000000?000?????????????????111100111111")
  def VSH                = Bits("b1000000000000000000001000000000?000?????????????????111100111111")
  def VSB                = Bits("b1000000000000000000000000000000?000?????????????????111100111111")
  def VSSTD              = Bits("b10000000000000000000111000??????000?????????????????111100111111")
  def VSSTW              = Bits("b10000000000000000000101000??????000?????????????????111100111111")
  def VSSTH              = Bits("b10000000000000000000011000??????000?????????????????111100111111")
  def VSSTB              = Bits("b10000000000000000000001000??????000?????????????????111100111111")
  def VLXD               = Bits("b10100000000000000000110?????????????????????????????101100111111")
  def VLXW               = Bits("b10100000000000000000100?????????????????????????????101100111111")
  def VLXWU              = Bits("b10100000000000000001100?????????????????????????????101100111111")
  def VLXH               = Bits("b10100000000000000000010?????????????????????????????101100111111")
  def VLXHU              = Bits("b10100000000000000001010?????????????????????????????101100111111")
  def VLXB               = Bits("b10100000000000000000000?????????????????????????????101100111111")
  def VLXBU              = Bits("b10100000000000000001000?????????????????????????????101100111111")
  def VSXD               = Bits("b10100000000000000000110?????????????????????????????111100111111")
  def VSXW               = Bits("b10100000000000000000100?????????????????????????????111100111111")
  def VSXH               = Bits("b10100000000000000000010?????????????????????????????111100111111")
  def VSXB               = Bits("b10100000000000000000000?????????????????????????????111100111111")
  def VLSD               = Bits("b00000000000000000000110000000000????????????????0000101100111111")
  def VLSW               = Bits("b00000000000000000000100000000000????????????????0000101100111111")
  def VLSWU              = Bits("b00000000000000000001100000000000????????????????0000101100111111")
  def VLSH               = Bits("b00000000000000000000010000000000????????????????0000101100111111")
  def VLSHU              = Bits("b00000000000000000001010000000000????????????????0000101100111111")
  def VLSB               = Bits("b00000000000000000000000000000000????????????????0000101100111111")
  def VLSBU              = Bits("b00000000000000000001000000000000????????????????0000101100111111")
  def VSSD               = Bits("b00000000000000000000110????????0????????000000000000111100111111")
  def VSSW               = Bits("b00000000000000000000100????????0????????000000000000111100111111")
  def VSSH               = Bits("b00000000000000000000010????????0????????000000000000111100111111")
  def VSSB               = Bits("b00000000000000000000000????????0????????000000000000111100111111")
  def VLAD               = Bits("b00000000001000000000110000000000000?????????????0000101100111111")
  def VLAW               = Bits("b00000000001000000000100000000000000?????????????0000101100111111")
  def VLAWU              = Bits("b00000000001000000001100000000000000?????????????0000101100111111")
  def VLAH               = Bits("b00000000001000000000010000000000000?????????????0000101100111111")
  def VLAHU              = Bits("b00000000001000000001010000000000000?????????????0000101100111111")
  def VLAB               = Bits("b00000000001000000000000000000000000?????????????0000101100111111")
  def VLABU              = Bits("b00000000001000000001000000000000000?????????????0000101100111111")
  def VSAD               = Bits("b00000000001000000000110????????0000?????000000000000111100111111")
  def VSAW               = Bits("b00000000001000000000100????????0000?????000000000000111100111111")
  def VSAH               = Bits("b00000000001000000000010????????0000?????000000000000111100111111")
  def VSAB               = Bits("b00000000001000000000000????????0000?????000000000000111100111111")
  def VPCLEAR            = Bits("b1000010000000010000????0000?????0000????0000????????011000111111")
  def VPSET              = Bits("b1000011111111110000????0000?????0000????0000????????011000111111")
  def VPXORXOR           = Bits("b1000010110100110000????0000?????0000????0000????????011000111111")
  def VPXOROR            = Bits("b1000010111110110000????0000?????0000????0000????????011000111111")
  def VPXORAND           = Bits("b1000010001010010000????0000?????0000????0000????????011000111111")
  def VPORXOR            = Bits("b1000010110101010000????0000?????0000????0000????????011000111111")
  def VPOROR             = Bits("b1000010111111110000????0000?????0000????0000????????011000111111")
  def VPORAND            = Bits("b1000010001010110000????0000?????0000????0000????????011000111111")
  def VPANDXOR           = Bits("b1000010101011010000????0000?????0000????0000????????011000111111")
  def VPANDOR            = Bits("b1000010101011110000????0000?????0000????0000????????011000111111")
  def VPANDAND           = Bits("b1000010000000110000????0000?????0000????0000????????011000111111")
}
