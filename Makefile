SHELL := /bin/sh

ISASIM_H := ../riscv-isa-sim/riscv/encoding.h
ISASIM_HWACHA_H := ../riscv-isa-sim/hwacha/opcodes_hwacha.h
ISASIM_HWACHA_UT_H := ../riscv-isa-sim/hwacha/opcodes_hwacha_ut.h
PK_H := ../riscv-pk/machine/encoding.h
FESVR_H := ../riscv-fesvr/fesvr/encoding.h
HWACHA_GAS_H := ../riscv-gnu-toolchain/riscv-binutils-gdb/include/opcode/riscv-opc-hwacha.h
ENV_H := ../riscv-tests/env/encoding.h
OPENOCD_H := ../riscv-openocd/src/target/riscv/encoding.h

ALL_OPCODES := opcodes-pseudo opcodes opcodes-rvc opcodes-rvc-pseudo opcodes-custom opcodes-hwacha-pseudo opcodes-hwacha opcodes-hwacha-ut opcodes-hwacha-ut-pseudo

install: $(ISASIM_H) $(ISASIM_HWACHA_H) $(ISASIM_HWACHA_UT_H) $(PK_H) $(FESVR_H) $(HWACHA_GAS_H) $(ENV_H) inst.chisel instr-table.tex priv-instr-table.tex inst-hwacha.scala instr-hwacha-table.tex

$(ISASIM_H) $(PK_H) $(FESVR_H) $(ENV_H) $(OPENOCD_H): $(ALL_OPCODES) parse-opcodes encoding.h
	cp encoding.h $@
	cat opcodes opcodes-rvc-pseudo opcodes-rvc opcodes-custom | ./parse-opcodes -c >> $@

$(HWACHA_GAS_H): $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha opcodes-hwacha-ut opcodes-hwacha-ut-pseudo | ./parse-opcodes -cpre HWACHA > $@

$(ISASIM_HWACHA_H): $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha opcodes-hwacha-pseudo | ./parse-opcodes -c | \
	cpp -P -D DECLARE_INSN=DECLARE_INSN | sort -o $@

$(ISASIM_HWACHA_UT_H): $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha-ut | ./parse-opcodes -c | \
	cpp -P -D DECLARE_INSN=DECLARE_INSN | sort -o $@

inst.chisel: $(ALL_OPCODES) parse-opcodes
	cat opcodes opcodes-custom opcodes-pseudo | ./parse-opcodes -chisel > $@

inst-hwacha.scala: $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha opcodes-hwacha-ut opcodes-hwacha-ut-pseudo | ./parse-opcodes -hchisel > $@

inst.go: opcodes opcodes-pseudo parse-opcodes
	cat opcodes opcodes-pseudo | ./parse-opcodes -go > $@

instr-table.tex: $(ALL_OPCODES) parse-opcodes
	cat opcodes opcodes-pseudo | ./parse-opcodes -tex > $@

instr-hwacha-table.tex: $(ALL_OPCODES) parse-opcodes
	cat opcodes-hwacha opcodes-hwacha-pseudo opcodes-hwacha-ut opcodes-hwacha-ut-pseudo | ./parse-opcodes -htex > $@

priv-instr-table.tex: $(ALL_OPCODES) parse-opcodes
	cat opcodes opcodes-pseudo | ./parse-opcodes -privtex > $@

.PHONY : install
