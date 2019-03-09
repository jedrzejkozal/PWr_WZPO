package Algorithm;

import Validation.DataDivision;

public interface IAlgorithmAdapter {

    void fit(DataDivision division);
    SingleFoldAlgResult predict(DataDivision division);
}