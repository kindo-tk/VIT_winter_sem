import numpy as np
import matplotlib.pyplot as plt

def calculate_acf(t, xt, max_lag):
    """
    Calculate the autocorrelation function (ACF) for given time series xt with time points t.
    
    Parameters:
    t (list or np.array): Time points (optional, not directly used in ACF calculation)
    xt (list or np.array): Time series data
    max_lag (int): Maximum number of lags to calculate ACF
    
    Returns:
    lags (np.array): Array of lag values
    acf_values (np.array): Array of ACF values for corresponding lags
    """
    xt = np.array(xt)
    N = len(xt)
    mean_xt = np.mean(xt)
    
    acf_values = []
    lags = np.arange(1, max_lag + 1)
    
    for k in lags:
        # Compute numerator and denominator
        numerator = np.sum((xt[:N - k] - mean_xt) * (xt[k:] - mean_xt))
        print(numerator)
        denominator = np.sum((xt - mean_xt) ** 2)
        acf_k = numerator / denominator
        acf_values.append(acf_k)
    
    return lags, np.array(acf_values)

# Input
t = list(map(int,input("Enter the values of t (comma separated):").split(',')))
t = np.array(t)
xt = list(map(int,input("Enter the values of xt (comma separated):").split(',')))
xt = np.array(xt)
max_lag = int(input("Enter the value of max lag (k):"))

# Calculate ACF
lags, acf_values = calculate_acf(t, xt, max_lag)

# Print ACF values
for i, acf in zip(lags, acf_values):
    print(f"ACF({i}) = {acf:.4f}")
